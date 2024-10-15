#include<stdio.h>
void nhap(int a[],int n)
{
	for(int i=0;i<n;i++)
	{
		printf("a[%d] = ",i+1);
		scanf("%d",&a[i]);
	}
}
void xuat(int a[],int n)
{
	for(int i=0;i<n;i++)
		printf("a[%d] = %d\n",i+1,a[i]);
}
int bai1(int a[],int n)
{
	int sum=0;
	for(int i=0;i<n;i++)
		sum+=a[i];
	return sum;
}
bool soHoanThien(int n)
{
	int ans = 0 ;
	for(int i=1;i<n;i++)
		if(n%i==0)
			ans+=i;
	if(ans==n)
		return true;
	else
		return false;
}
int bai2(int a[],int n)
{
	int dem = 0;
	for(int i=0;i<n;i++)
		if(soHoanThien(a[i])==true)
			dem++;
	return dem;
}
void bai3(int a[],int n)
{
	int demChan=0,demLe=0;
	for(int i=0;i<n;i++)
		if(a[i]%2==0)
			demChan++;
		else
			demLe++;
	printf("Co %d so chan va %d so le",demChan,demLe);
}
void bai4(int a[],int n)
{
	int demAm=0,demDuong=0;
	for(int i=0;i<n;i++)
		if(a[i] > 0)
			demDuong++;
		else
			demAm++;
	printf("Co %d so am va %d so duong",demAm,demDuong);
}
int bai5(int a[],int n)
{
	int sum = 0;
	for(int i=0;i<n;i++)
		if(a[i]%2==0)
			sum+=a[i];
	return sum;
}
int bai6(int a[],int n)
{
	int sum = 0;
	for(int i=0;i<n;i++)
		if(a[i]%2!=0)
			sum+=a[i];
	return sum;
}
int bai7(int a[],int n)
{
	int sum = 0;
	for(int i=0;i<n;i++)
		if(a[i] < 0)
			sum+a[i];
	return sum;
}
int bai8(int a[],int n)
{
	int sum = 0;
	for(int i=0;i<n;i++)
		if(a[i] > 0)
			sum+=a[i];
	return sum;
}
int bai9(int a[],int n)
{
	int sum = 0;
	for(int i=0;i<n;i++)
		if(a[i]%5==0)
		 sum+=a[i];
	return sum;
}
int bai10(int a[],int n)
{
	int max=a[0];
	for(int i=1;i<n;i++)
		if(a[i]>max)
			max=a[i];
	return max;
}
int bai11(int a[],int n)
{
	int min = a[0];
	for(int i=1;i<n;i++)
		if(a[i]<min)
			min=a[i];
	return min;
}
int bai12(int a[],int n)
{
	int chanMax = a[0] ;
	for(int i=1;i<n;i++)
		if(a[i]%2==0)
			if(a[i]>chanMax)
				chanMax=a[i];
	return chanMax;
}
int bai13(int a[],int n)
{
	int leMin = a[0] ;
	for(int i=1;i<n;i++)
		if(a[i]%2!=0)
			if(a[i]<leMin)
				leMin=a[i];
	return leMin;
}
main()
{
	int n,chon;
	do
	{
		printf("\n========== MENU ==========\n");
        printf("31. Nhap day so va tinh tong day so\n");
        printf("32. Dem so hoan thien trong day\n");
        printf("33. Dem so chan va le trong day\n");
        printf("34. Dem so am va duong trong day\n");
        printf("35. Tinh tong cac so chan trong day\n");
        printf("36. Tinh tong cac so le trong day\n");
        printf("37. Tinh tong cac so am trong day\n");
        printf("38. Tinh tong cac so duong trong day\n");
        printf("39. Tinh tong cac so chia het cho 5 trong day\n");
        printf("40. Tim so lon nhat trong day\n");
        printf("41. Tim so nho nhat trong day\n");
        printf("42. Tim so chan lon nhat trong day\n");
        printf("43. Tim so le nho nhat trong day\n");
        printf("0. Thoat\n");
		printf("\nNhap lua chon : ");
		scanf("%d",&chon);
		switch(chon)
		{
			case 1:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so trong day la : %d",bai1(a,n));
				break;
			}
			case 2:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Co %d so hoan thien trong day",bai2(a,n));
				break;
			}
			case 3:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				bai3(a,n);
				break;
			}
			case 4:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				bai4(a,n);
				break;
			}
			case 5:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so chan trong day la : %d",bai5(a,n));
				break;
			}
			case 6:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so le trong day la : %d",bai6(a,n));
				break;
			}
			case 7:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so am trong day la : %d",bai7(a,n));
				break;
			}
			case 8:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so duong trong day la : %d",bai8(a,n));
				break;
			}
			case 9:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("Tong cac so chia het cho 5 trong day la : %d",bai9(a,n));
				break;
			}
			case 10:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("So lon nhat trong day la : %d",bai10(a,n));
				break;
			}
			case 11:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				printf("So nho nhat trong day la : %d",bai11(a,n));
				break;
			}
			case 12:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				if(bai12(a,n)%2!=0)
					printf("Khong co so chan trong day ");
				else
					printf("So chan lon nhat trong day la : %d",bai12(a,n));
				break;
			}
			case 13:
			{
				printf("Nhap so phan tu : ");
				scanf("%d",&n);
				int a[n];
				nhap(a,n);
				if(bai13(a,n)%2==0)
					printf("Khong co so le trong day ");
				else
					printf("So le nho nhat trong day la : %d",bai13(a,n));
				break;
			}
			case 0:
			{
				printf("Thoat chuong trinh ");
				break;
			}
			default:
			{
				printf("Nhap sai, hay nhap lua chon trong khoang tu 1 -> 13 ");
				break;	
			}	
		}
	}
	while(chon!=0);
}