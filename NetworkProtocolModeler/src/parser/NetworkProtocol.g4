grammar NetworkProtocol;

start
:
	protocolDefinition+
;

protocolDefinition
:
	('protocol'|'datatype') name = ID packageDefinition? LBRACE variableDefinition+ RBRACE
;

packageDefinition
:
	'package' name = COMPOUND_ID
;

variableDefinition
:
	name = ID ':' (
		intType |
		stringType |
		binaryType |
		embeddedType |
		bitfieldType |
		listType |
		countType)
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

bitfieldDefinition:
	name = ID ':' bitLength = NUMBER
;

formatterDefinition:
	'formatter' name = ID
;

COMPOUND_ID:
	[a-zA-Z]+ ('.' [a-zA-Z]+)*
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