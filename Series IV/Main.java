#include<iostream>
using namespace std;
int main()
{
  int num,sum=2,i,x;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    if(i%2==0)
    {
      sum=(i*i)-2;
      std::cout<<sum<<" ";
    }
    else
    {
    sum=(i*i)-1;
    std::cout<<sum<<" ";
    }
  }
}