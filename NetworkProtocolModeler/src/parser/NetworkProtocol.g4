grammar NetworkProtocol;

start
:
	(
		pkg? protocol
	)+
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
	'protocol' name = ID LBRACE vardef+ RBRACE
;

vardef
:
	name = ID ':' (
		type = 'int' (LPAREN len = NUMBER RPAREN)? |
		type = 'string' (LPAREN len = (NUMBER|'*') RPAREN) |
		type = 'binary' (LPAREN len = (NUMBER|'*') RPAREN)) # variableDef
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