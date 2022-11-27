 

 .globl   binomial_asm
    .p2align 2
     .type    binomial_asm,%function

binomial_asm:

//Olan Healy (21318204)
// You will need to call fact_asm from within this code using the bl instruction
// This is a non-leaf procedure so you need to save X30 on the stack
// and restore it from the stack before returning
// Note that fact_asm does not need to have global scope because it is not used outside this file.
SUB SP, SP, #16
STR x30, [SP, #0]
CMP x0, XZR
BLT label1
B   label2
label1:     MOV x0, #-1
            B    endlabel
label2:     CMP  x1, XZR
            BLT   label3
            B     label4
label3:     MOV x0, #-1
            B   endlabel
label4:     CMP x0, #10
            bgt    label5
            B      label6
label5:     MOV x0, XZR
            B     endlabel
label6:     CMP x0, x1
            BLT  label7
            B    label8
label7:     MOV   x0, #-1
            B     endlabel
label8:     CMP x0, XZR
            BEQ   label9
            B     label10
label9:     MOV x0, #1
            B    endlabel
label10:    SUB x11, x0, x1
            BL    fact_asm
            MOV x12, x0
            MOV x0, x1
            Bl    fact_asm
            MOV    x13, x0
            MOV x0, x11
            BL    fact_asm
            MUL x11, x0, x13
            SDIV    x0, x12, x11
            B     endlabel
endlabel:   LDR x30, [SP, #0]
            ADD SP, SP, #16
            BR x30



fact_asm:

        MOV        x10, x0
        CMP        x10, XZR
        BLT        stage1
        B          stage2
stage1: MOV        x0, #-1
        B          endstage
stage2: CMP        x10, #20
        BGT       stage3
        B         stage4
stage3: MOV        x0, #-1
        B       endstage
stage4: CMP        x10, XZR
        BEQ        stage5
        B         stage6
stage5: MOV        x0, #1
        B        endstage
stage6: MOV        x0, #1
        MOV        x9, #1
stage8: CMP        x9, x10
        BLE        stage7
        B        endstage
stage7: MUL        x0, x0, x9
        ADD        x9, x9, #1
        B        stage8
endstage:
        BR         x30
