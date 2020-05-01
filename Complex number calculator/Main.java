#include <iostream>
#include <cmath>
using namespace std;

struct Complex
{
    float real;
    float imag;
};
int main()
{
    Complex n1,n2,result;
    int ch;
    std::cin>>ch;
    cin >> n1.real >> n1.imag;
    cin >> n2.real >> n2.imag; 
    switch(ch)
    {
        case 1: result.real=n1.real+n2.real;
                result.imag=n1.imag+n2.imag;
                cout<<result.real;
                if(result.imag<0)
                {
                    cout<<"-";
                }
                else
                {
                    cout<<"+";
                }
                cout<<abs(result.imag)<<"i";
                break;
        case 2: result.real=n1.real-n2.real;
                result.imag=n1.imag-n2.imag;
                cout<<result.real;
                if(result.imag<0)
                {
                    cout<<"-";
                }
                else
                {
                    cout<<"+";
                }
                cout<<abs(result.imag)<<"i";
                break;
            break;
        case 3: result.imag=(n1.real*n2.imag)+(n1.imag*n2.real);
                result.real=n1.real*n2.real;
                if((n1.imag*n2.imag)<0)
                {
                    result.real=result.real+abs(n1.imag*n2.imag);
                }
                else
                {
                    result.real=result.real-abs(n1.imag*n2.imag);
                }
                cout<<result.real;
                if(result.imag<0)
                {
                    cout<<"-";
                }
                else
                {
                    cout<<"+";
                }
                cout<<abs(result.imag)<<"i";
                break;
        default:cout<<"Invalid choice";
            break;
    }
}