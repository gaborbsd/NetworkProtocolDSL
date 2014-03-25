grammar NetworkProtocol;

start
:
	protocol+
;

pkg
:
	'package' name = ID
	(
		'.' ID
	)*
;

protocol
:
	'protocol' name = ID pkg? LBRACE vardef+ RBRACE
;

vardef
:
	name = ID ':' (
		inttype |
		stringtype |
		binarytype) # variableDef
;

inttype:
	type = 'int' (LPAREN len = NUMBER RPAREN)?
;

stringtype:
	type = 'string' (LPAREN len = (NUMBER|'*') RPAREN)
;

binarytype:
	type = 'binary' (LPAREN len = (NUMBER|'*') RPAREN)
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