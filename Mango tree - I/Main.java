#include<iostream>
using namespace std;
int main()
{
  int a,b,c,t,t1;
  cin>>a>>b>>c;
  t=a*b;
  t1=t-b;
  if(c==1)
  {
    cout<<"Yes";
  }
  else if(c<=b)
  {
    std::cout<<"Yes";
  }
  else if(c==t)
  {
    cout<<"Yes";
  }
  else if(c%b==1)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
          
}