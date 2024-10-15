#include<stdio.h>
void nhapMang(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("a[%d] = ",i);
		scanf("%d",&a[i]);
	}
}
void inMang(int a[],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d ",a[i]);
}
void chenMang(int a[],int &n,int x,int vt)
{
	int i;
	for(i=n-1;i>=vt-1;i--)
		a[i+1]=a[i];
	a[vt-1]=x;
	n=n+1;
}
void xoaMang(int a[],int &n,int vt)
{
	for(int i=vt-1;i<n-1;i++)
		a[i]=a[i+1];
	n=n-1;
}
void trungBinhCong(int a[],int n)
{
	float tongChan,tongLe;
	int demChan,demLe;
	tongChan=0;tongLe=0;demChan=0;demLe=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
			{
				tongChan+=a[i];
				demChan++;
			}
		else
			{
				tongLe+=a[i];
				demLe++;
			}
	}
	printf("\nTrung binh cong cac so chan la: %.2f",tongChan/demChan*1.0);
	printf("\nTrung binh cong cac so le la: %.2f",tongLe/demLe*1.0);
}
main()
{
	int n,chon;
	
	do
	{
	printf("\nNhap 1 cho cau 1\nNhap 2 cho cau 2\nNhap 3 cho cau 3");
	printf("\nNhap lua chon : ");
	scanf("%d",&chon);
	switch(chon)
	{
		case 1 : 
		{
			printf("Nhap so phan tu  : ");
			scanf("%d",&n);
			int a[n];
			nhapMang(a,n);
			int x,vt;
			printf("Nhap phan tu muon chen : ");
			scanf("%d",&x);
			printf("Nhap vi tri muon chen : ");
			scanf("%d",&vt);
			printf("Mang sau khi chen la : \n");
			chenMang(a,n,x,vt);
			inMang(a,n);
			break;
		}
		case 2:
		{
			printf("Nhap so phan tu  : ");
			scanf("%d",&n);
			int a[n];
			nhapMang(a,n);
			int vt;
			printf("Nhap vi tri muon xoa : ");
			scanf("%d",&vt);
			xoaMang(a,n,vt);
			printf("Mang sau khi xoa la : \n");
			inMang(a,n);
			break;
		}
		case 3:
		{
			printf("Nhap so phan tu  : ");
			scanf("%d",&n);
			int a[n];
			nhapMang(a,n);
			trungBinhCong(a,n);
		}
	}
	}
	while(chon!=0);
}