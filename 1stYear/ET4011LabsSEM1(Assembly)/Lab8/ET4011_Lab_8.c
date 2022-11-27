/*
 ============================================================================
 Name        : ET4011_Lab_8.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab_2_add_asm.h"

int main(void) {
	long long int new_var, control_var;

	new_var = 100;
	control_var = 0;
	puts("Result = "); /* prints ‘Result = ‘ */
	new_var = myadd2(5, 10, 6, control_var);
	printf("%lld\n", new_var);
	return EXIT_SUCCESS;
}
