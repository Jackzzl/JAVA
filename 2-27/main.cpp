#include <iostream>

using namespace std;

int main(){
int n;
cout<<"������ɼ���"<<endl;
cin>>n;
if(n>100||n<0)
cout<<"��������"<<endl;
else{
switch(n=n/10){
case 10:
case 9:
cout<<"��"<<endl;
break;
case8:
cout<<"��"<<endl;
break;
case 7:
case 6:
cout<<"��"<<endl;
break;
default:
cout<<"��"<<endl;
break;
}
}
return 0;
}
