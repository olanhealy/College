	.globl   factorial_asm
    .p2align 2
	.type    factorial_asm,%function

factorial_asm:



CMP X0, xzr
blt label 1
b label 2


label1: mov X0, #-1
        b endlabel1

label2: cmp X0, #20
        bgt label3
        b label4 
label3: mov X0, #-1
        b end label1

label4: cmp X0, xzr
        beq label5
        b label6

label5: add x10, x10, #1
        mov X0, X10
        b label6

label6: mov X12, X0
        blt label7
        b endlabel1

label7 mul x0, x0, x13
        b label6
        
        
        