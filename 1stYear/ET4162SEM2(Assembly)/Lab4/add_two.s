.globl   add_two
.p2align 2
.type    add_two,%function

add_two:
CBZ X3, Label1
b Label3

Label1: add X9,X1,X2
        add X0,X0,X9
       b Label2
Label3: sub X9,X1,X2
         add X0,X0,X9

Label2: br X30
