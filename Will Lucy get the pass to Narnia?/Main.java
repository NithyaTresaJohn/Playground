#include<iostream>
int main()
{
int num_1,num_2;
int operation;
std::cout<<"Enter first number : Enter second number : Menu \n";
std::cout<<"1.Addition \n" ;
std::cout<<"2.Subtraction\n";
std::cout<<"3.Multiplication\n";
std::cout<<"4.Division\n";
std::cout<<"5.Remainder\n";
std::cin>>num_1>>num_2>>operation;
switch (operation)

    {
    case 1:
    std::cout<<num_1+num_2;
    break;

    case 2:
    std::cout<<num_1-num_2;
    break;

    case 3:
    std::cout<<num_1*num_2;
    break;

 case 4:
    std::cout<<num_1/num_2;
    break;
    
  case 5:
    std::cout<<num_1%num_2;
    break;
    
  default:std::cout<<"Invalid operation";
    break;
}
}