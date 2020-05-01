#include<iostream>
int main()
{
    int unit;
    int amt;
    std::cin>>unit;
    if(unit <=200)
    {
        amt = unit * 0.50;
    }
    else if(unit <= 400)
    {
        amt = 100+ (unit * 0.65);
    }
    else if(unit <= 600)
    {
        amt = 200 + (unit*.80);
    }
    else
    {
        amt = 425 + (unit * 1.25);
    }
    std::cout<<"Rs."<<amt;
}