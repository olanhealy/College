	.globl   gcd_asm
    .p2align 2
	.type    gcd_asm,%function

gcd_asm:
//Olan Healy
//21318204
// x9 = y, x10 = x,  x11 = temp, x12 = n

		  SUB SP, SP, #48
		  STR x12, [SP, #48]
		  STR x11, [SP, #32]
		  STR x10, [SP, #16]
		  STR x9, [SP, #0]

		  MOV x10, x0
		  MOV x9, x1

label1:   CMP x9,xzr
      	  BGT label2
          B endLabel

label2:   CMP x10, x9
       	  BLT label4
          B label3

label3:   SUB x12, x10, x9
          MOV x10, x9
       	  MOV x9, x12
       	  B label1

label4:   MOV x11, x10
       	  MOV x10, x9
       	  MOV x9, x11
       	  B label3

endLabel: MOV x0, x10
       	  LDR x9, [SP, #0]
	  LDR x10, [SP, #16]
	  LDR x11, [SP, #32]
	  LDR x12, [SP, #48]
	  ADD SP, SP, #48
	  BR      x30



