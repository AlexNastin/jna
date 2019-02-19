//
//  main.cpp
//  SimpleProject
//
//  Created by Алексей Настин on 2/18/19.
//  Copyright © 2019 Алексей Настин. All rights reserved.
//
#include <iostream>
#include "MyHandler.cpp"
using namespace std;

int main() {

    cout << "Hello world!!!!!\n";
    MyHandler* handler = new MyHandler();
    
    handler->test();

    
    return 0;
}

