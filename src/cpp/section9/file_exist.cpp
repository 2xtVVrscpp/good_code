#include<iostream>
#include<stdio.h>
using namespace std;

// #define DEBUG

int main(void){
  FILE *fp;

  if((fp = fopen("./sample.txt", "r")) == NULL){
    cout << "file is not existed." << endl;
  }else{
    cout << "file is existed." << endl;
  }

  #ifdef DEBUG

  cout << "debug code." << endl;

  #endif

  return 0;
}