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
	'package' name = ID
	(
		'.' ID
	)*
;

variableDefinition
:
	name = ID ':' (
		intType |
		stringType |
		binaryType |
		embeddedType |
		bitfieldType)
;

intType:
	type = 'int' (LPAREN len = NUMBER RPAREN)?
;

stringType:
	type = 'string' (LPAREN len = (NUMBER|'*') RPAREN)
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

bitfieldDefinition:
	name = ID ':' bitLength = NUMBER
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