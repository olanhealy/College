.globl   myadd2
.p2align 2
.type    myadd2,%function

myadd2:                     // Function "myadd2" entry point.
//
//BL {x3 == x30}
CBNZ x3, label2
	add x9, x1, x2
	add x0, x9, x0
	b label3
	label2:
		sub x9, x1, x2
		add x0, x9, x0
label3:
	br x30   // Return by branching to the address in the link register.

