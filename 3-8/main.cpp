#include <iostream>

using namespace std;


float twitch(float x){
     double  C;
     C=(x-32)*5/9;
     return C;
    }
int main()
{
    cout<<"�����¶�ת��"<<endl;
    cout<<"������һ�������¶�:"<<endl;
    float F;
    cin>>F;
    cout<<"���Ϊ:"<<twitch(F)<<endl;
    return 0;
}
