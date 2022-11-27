#include <ctype.h> 
int approxEqual(float el, float refval, float tolerance)
{
  return (refval-tolerance <= el &&
	  el <= refval+tolerance);
}