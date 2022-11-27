 .globl   fib_recurs_asm
    .p2align 2
	.type    fib_recurs_asm,%function
//olan healy // 21318204


fib_recurs_asm:
	sub SP, SP, #32 // moving the stack pointer
	str X30, [SP, #24]
    str X9, [SP, #16]
    str X10, [SP, #8]
    str X11, [SP, #0]

	cmp X0, XZR
	beq endlabel

	cmp X0, #1
	beq endlabel



	mov X10, X0
    sub X9, X0, #1 // n = n-1
    mov X0, X9
	bl fib_recurs_asm // calls top

	mov X11, X0
	sub X0, X9, #1

	bl fib_recurs_asm

	add X0, X0, X11

endlabel:

	ldr X11, [SP, #0]
	ldr X10, [SP, #8]
	ldr X9, [SP, #16]
	ldr X30, [SP, #24]
    add SP, SP, #32
    br		X30
