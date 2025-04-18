#include <iostream>
using namespace std;

class Point{
  int x, y;
  public:

  Point(int a =0, int b =0){
    x = a;
    y = b;
  }
  Point operator + (Point const& p){
    Point result;
    result.x = x + p.x;
    result.y = y + p.y;
    return result;
  }
  void display(){
    cout<<"("<<x<<","<<y<<")"<<endl;
  }

};
int main(){
  Point p1(4,6), p2(5,8), p5(6,7);
  Point p3 = p1+p2+p5;
  p3.display();
  return 0;

}