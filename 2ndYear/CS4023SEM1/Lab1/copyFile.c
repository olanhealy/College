#include <stdio.h>
#include <stdlib.h>

int main()
{
    int c;
    FILE *from;
    FILE *to;

    from = fopen("file.txt", "r"); //reads contents of file.txt
    to = fopen("out.txt", "w"); //opens new file out.txt to write too 
    if (from)
    {

        while ((c = getc(from)) != EOF) //gets first character in file.txt and checks if equal to eof, if not loop is activated
        

        {
            fprintf(to, "%c", c); //writes the content one by one to out.txt (declared as variable to)
        }
    }

    fclose(from);
    fclose(to); //closes files
    return 0;
}
