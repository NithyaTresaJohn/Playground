#include<iostream>
int greatest_num(int a, int b, int c)
{
if(a>=b && a>=c)
{
return a;
}

else if(b>=a && b>=c)
{
return b;
}

else if(c>=a && c>=b)
{
return c;
}
}
int main()
{
int x,y,z;
std::cin>>x;
std::cin>>y;
std::cin>>z;
  if(x >= y && x >= z)
    {
        if(y >= z)
        {
            std::cout<<"The treasure is in box which has number "<<y;
        }
        else
        {
            std::cout<<"The treasure is in box which has number "<<z;
        }
    }
    else if(y >= x && y >= z)
    {
        if(x >= z)
        {
            std::cout<<"The treasure is in box which ha number "<<x;
        }
        else
        {
            std::cout<<"The treasure is in box which has number "<<z;
        }
    }
    else if(x >= y)
    {
        std::cout<<"The treasure is in box which has number "<<x;
    }
    else
    {
        std::cout<<"The treasure is in box which has number "<<y;
    }
int result;

for(result=greatest_num(x,y,z); result>=1; result--){
if(x%result==0 && y%result==0 && z%result==0){
break;
}
}
  std::cout<<"\nThe code to open the box is "<<result;
}