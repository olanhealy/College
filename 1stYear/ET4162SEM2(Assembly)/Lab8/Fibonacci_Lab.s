.globl   fib_asm
    .p2align 2
	.type    fib_asm,%function

fib_asm:

	cmp		x0, xzr
	bge		label1
	mov		x0, #-1
	b		endlabel

label1:
	cmp		x0, #20
	ble		label2
	mov		x0, #-1
	b		endlabel

label2:
	cmp		x0, #2
	bge		label3
	b		endlabel

label3:
	nop
    mov x9, xzr
	mov x10, #1
	mov x11, xzr
	mov x12, #2

label4:
	cmp x12, x0
	bgt pluslabel
	b label5

label5:
	add x12, x12, #1
	add x11, x9, x10
	mov x9, x10
	mov x10, x11
    b label4

pluslabel:
    mov x0, x10
    b endlabel


endlabel:
	br		x30