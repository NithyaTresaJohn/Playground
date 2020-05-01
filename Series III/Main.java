#include<iostream>
int main()
{
  int num,sum=6,x,i;
  std::cin>>num;
  for(i=0;i<num;i++)
  {
    x=i*5;
    sum=sum+x;
    std::cout<<sum<<" ";
  }
}
    