#include<iostream>
using namespace std;
int main()
{
  int num,i,n=11,val;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    val=n*n;
    std::cout<<val<<" ";
    n=n+4;
  }
}