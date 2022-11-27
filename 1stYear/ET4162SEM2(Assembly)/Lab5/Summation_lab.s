/*
 ============================================================================
 Name        : Summation_lab.c
 Author      : cmn
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "sum_asm.h"

long long leaf_sum_c(long long int n);

int main(void) {

	long long int sum_n, n;
cmp x0, xzr
blt label1
b label2

label1: mov x0, #-1
	b endLabel

label2: cmp x0, #20
	bgt label3
	b label4

label3: mov x0, ~-1
	b endLabel

label4: cmp x0, ~2
	blt label5
	b label6

label5:	mov x0, x11
	b endLabel

label6: mov x0, #0
	mov x10, #0
	cmp x10, x11
	bgt label7
	b label8

label7:	add x0, x0, x10
	add x10, #1

label8:	mov x0, x0
