#include<stdio.h>

void nhap(int a[], int n) {
    for(int i = 0; i < n; i++) {
        printf("a[%d] = ", i + 1);
        scanf("%d", &a[i]);
    }
}

int bai31(int a[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++)
        sum += a[i];
    return sum;
}

void bai33(int a[], int n) {
    int demChan = 0, demLe = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] % 2 == 0)
            demChan++;
        else
            demLe++;
    }
    printf("Co %d so chan va %d so le\n", demChan, demLe);
}

int bai35(int a[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] % 2 == 0)
            sum += a[i];
    }
    return sum;
}

int bai37(int a[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] < 0)
            sum += a[i];
    }
    return sum;
}

int bai39(int a[], int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] % 5 == 0)
            sum += a[i];
    }
    return sum;
}

int bai41(int a[], int n) {
    int min = a[0];
    for(int i = 1; i < n; i++) {
        if(a[i] < min)
            min = a[i];
    }
    return min;
}

int bai43(int a[], int n) {
    int leMin = -1; 
    for(int i = 0; i < n; i++) {
        if(a[i] % 2 != 0) {
            if(leMin == -1 || a[i] < leMin)
                leMin = a[i];
        }
    }
    return leMin;
}

int main() {
    int n, chon;
    do {
        printf("\n========== MENU ==========\n");
        printf("31. Nhap day so va tinh tong day so\n");
        printf("33. Nhap day so va dem so chan va le trong day\n");
        printf("35. Nhap day so va tinh tong cac so chan trong day\n");
        printf("37. Nhap day so va tinh tong cac so am trong day\n");
        printf("39. Nhap day so va tinh tong cac so chia het cho 5 trong day\n");
        printf("41. Nhap day so va tim so nho nhat trong day\n");
        printf("43. Nhap day so va tim so le nho nhat trong day\n");
        printf("0. Thoat\n");
        printf("\nNhap lua chon : ");
        scanf("%d", &chon);
        switch(chon) {
            case 31:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                printf("Tong cac so trong day la: %d\n", bai31(a, n));
                break;
            }
            case 33:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                bai33(a, n);
                break;
            }
            case 35:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                printf("Tong cac so chan trong day la: %d\n", bai35(a, n));
                break;
            }
            case 37:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                printf("Tong cac so am trong day la: %d\n", bai37(a, n));
                break;
            }
            case 39:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                printf("Tong cac so chia het cho 5 trong day la: %d\n", bai39(a, n));
                break;
            }
            case 41:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                printf("So nho nhat trong day la: %d\n", bai41(a, n));
                break;
            }
            case 43:
            {
                printf("Nhap so phan tu: ");
                scanf("%d", &n);
                int a[n];
                nhap(a, n);
                int leMin = bai43(a, n);
                if(leMin == -1)
                    printf("Khong co so le trong day\n");
                else
                    printf("So le nho nhat trong day la: %d\n", leMin);
                break;
            }
            case 0:
            {
                printf("Thoat chuong trinh\n");
                break;
            }
            default:
            {
                printf("Nhap sai, hay nhap lai!\n");
                break;
            }
        }
    } while(chon != 0);

    return 0;
}
