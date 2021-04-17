#include <stdio.h>


int main () {
    float i, f;
    for (i=1, f=1; i<=15; i++) {

        f = f * i;

        printf("fatorial de %.0f = %.0f\n", i, f);

    }
    return 0;
}


// $ gcc teste_zero.c -o testezero

// $ ./testezero

