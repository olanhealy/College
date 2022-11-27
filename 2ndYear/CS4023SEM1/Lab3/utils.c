#include <ctype.h>  
  

int approxEqual(float a, float reference, float tolerance){
    float lower = reference - tolerance;
    float upper = reference + tolerance;
    if(a >= lower && a <= upper){
        return 1;
    }
    return 0;
}