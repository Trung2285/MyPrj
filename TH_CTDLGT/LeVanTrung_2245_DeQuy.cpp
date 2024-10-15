#include<stdio.h>

int bai1(int n) {
    if(n == 1)
        return 1;
    else
        return n + bai1(n-1);
}

int bai2(int n) {
    if(n == 0)
        return 0;
    else
        if(n % 2 == 0)
            return -n + bai2(n-1);
        else
            return n + bai2(n-1);
}

int bai3(int n) {
    if(n == 0)
        return 0;
    else
        if(n % 2 == 0)
            return n + bai3(n-1);
        else
            return -n + bai3(n-1);
}

float bai4(int n) {
    if(n == 1)
        return 1;
    else
        return 1.0/n + bai4(n-1);
}

float bai5(int n) {
    if(n == 1)
        return 1;
    else
        if(n % 2 == 0)
            return -1.0/n + bai5(n-1);
        else
            return 1.0/n + bai5(n-1);
}

float bai6(int n) {
    if(n == 0)
        return 0;
    else
        if(n % 2 == 0 && n != 0)
            return 1.0/n + bai6(n-1);
        else if(n != 0)
            return -1.0/n + bai6(n-1);
        else
            return 0;
}

int bai7(int n) {
    if(n == 0 || n == 1)
        return 1;
    else
        return n * bai7(n-1);
}

float bai8(int n) {
    if(n == 1)
        return 1;
    else
        return 1.0/bai7(n) + bai8(n-1);
}

float bai9(int n) {
    if(n == 1)
        return 1;
    else
        if(n % 2 == 0)
            return -1.0/bai7(n) + bai9(n-1);
        else
            return 1.0/bai7(n) + bai9(n-1);
}

float bai10(int n) {
    if(n == 0)
        return 0;
    else
        if(n % 2 == 0 && n != 0)
            return 1.0/bai7(n) + bai10(n-1);
        else if(n != 0)
            return -1.0/bai7(n) + bai10(n-1);
        else
            return 0;
}

int main() {
    int n, chon;
    do {
        printf("\n================ MENU ================\n");
        printf("1. Tinh tong S = 1 + 2 + ... + n\n");
        printf("2. Tinh tong S = 1 - 2 + 3 - 4 + ... + n\n");
        printf("3. Tinh tong S = -1 + 2 - 3 + 4 + ... + n\n");
        printf("4. Tinh tong S = 1 + 1/2  +1/3 ... + 1/n\n");
        printf("5. Tinh tong S = 1 - 1/2  +1/3 ... +- 1/n\n");
        printf("6. Tinh tong S = -1 + 1/2  -1/3 ... +- 1/n\n");
        printf("7. Tinh tong S = n!\n");
        printf("8. Tinh tong S = 1 + 1/2! +1/3! ... + 1/n!\n");
        printf("9. Tinh tong S = 1 - 1/2! +1/3! ... +- 1/n!\n");
        printf("10.Tinh tong S = -1+ 1/2! -1/3! ... + 1/n!\n");
        printf("0. Thoat\n");
        printf("\nNhap lua chon : ");
        scanf("%d", &chon);
        switch(chon) {
            case 1:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %d\n", bai1(n));
                break;
            case 2:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %d\n", bai2(n));
                break;
            case 3:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %d\n", bai3(n));
                break;
            case 4:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai4(n));
                break;
            case 5:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai5(n));
                break;
            case 6:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai6(n));
                break;
            case 7:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %d\n", bai7(n));
                break;
            case 8:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai8(n));
                break;
            case 9:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai9(n));
                break;
            case 10:
                printf("Nhap so nguyen n: ");
                scanf("%d", &n);
                printf("S = %f\n", bai10(n));
                break;
            case 0:
                printf("Thoat chuong trinh\n");
                break;
            default:
                printf("Nhap sai, hay nhap lai\n");
                break;
        }
    } while(chon != 0);

    return 0;
}
