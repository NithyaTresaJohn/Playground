#include<iostream>
using namespace std;
int main()
{
  int num,i,sum,x=11;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    sum=x*x;
    std::cout<<sum<<" ";
    x=x+4;
  }
}