grammar NetworkProtocol;

start
:
	packageDefinition? protocolDefinition+
;

packageDefinition
:
	'package' name = ID
;

protocolDefinition
:
	('protocol'|'datatype') name = ID LBRACE variableDefinition+ RBRACE
;

variableDefinition
:
	trans='transient'? identityVar='*'? name = ID ':' (
		intType |
		stringType |
		binaryType |
		embeddedType |
		bitfieldType |
		listType |
		countType |
		lenType)
;

intType:
	type = 'int' (LPAREN len = NUMBER RPAREN)?
;

stringType:
	type = 'string' (LPAREN len = (NUMBER|'*') RPAREN) formatterDefinition?
;

binaryType:
	type = 'binary' (LPAREN len = (NUMBER|'*') RPAREN)
;

embeddedType:
	(type = ID)
;

bitfieldType:
	type = 'bitfield' LBRACE bitfieldDefinition+ RBRACE
;

listType:
	type = 'list' LPAREN (listElement = ID) RPAREN
;

countType:
	type = 'count' LPAREN len = NUMBER ',' countedList = ID RPAREN
;

lenType:
	type = 'length' LPAREN len = NUMBER ',' countedField = ID RPAREN
;

bitfieldDefinition:
	name = ID ':' bitLength = NUMBER
;

formatterDefinition:
	'formatter' name = ID
;

ID
:
	[a-zA-Z]+
;

NUMBER
:
	[1-9] [0-9]*
;

LBRACE
:
	'{'
;

RBRACE
:
	'}'
;

LPAREN
:
	'('
;

RPAREN
:
	')'
;

WS
:
	[ \t\r\n]+ -> skip
;