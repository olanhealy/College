
#include <stdio.h>
#include <stdlib.h>
#include "add_two.h"

int main(void) {

	long long int var1, var2, var3, var4, control_var;
		var1 = 5;
		var2 = 10;
		var3 = 6;

		control_var = 1;

		puts("LAB 1"); /* prints !!!Hello World!!! */
		printf("var1 = %lld\t var2 = %lld\t var3 = %lld\n", var1, var2, var3);
		var4 = add_two(var1, var2, var3, control_var);
		printf("var1 = %lld\t var2 = %lld\t var3 = %lld\t var4 = %lld\n", var1, var2, var3, var4);
		printf("End of Lab1\n");

		return EXIT_SUCCESS;
	}