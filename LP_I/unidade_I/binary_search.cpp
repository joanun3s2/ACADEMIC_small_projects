#include <iostream>
#include <vector>

using namespace std;

void generateOrderedVector(vector<int> &vector, int size){

    // Generates ordered vector
   for(int i=0; i<size; i++){
       vector.push_back(i);
   }

}

void printVector(vector<int> &vector, int leftLimit, int rightLimit){

    for(int i=leftLimit; i<rightLimit; i++){
       cout << vector[i] << " ";
    }

    cout << endl << endl;

}

int binarySearch(vector<int> &vector, int leftLimit, int rightLimit, int key , int mid){

    printVector(vector, leftLimit, rightLimit);
    
    // Cehcks if finds the key
    if(vector[mid] == key){
        return vector[mid];
    }

    // Check if the actual vector has more more than 1 position
    if(leftLimit >= rightLimit){
        return -1;
    }

    // Checks the if the found number is > or < than key and then cuts the vector
    // Into a smaller one with the half size of the actual
    if(vector[mid] > key){
        int newMid = (leftLimit + mid)/2;
        binarySearch(vector, leftLimit, mid, key, newMid);
    }else if(vector[mid] < key){
        int newMid = (rightLimit + mid)/2;
        binarySearch(vector, mid, rightLimit, key, newMid);
    }


}

void menu(int &size, int &key){
    cout << "Binary Search program" << endl << "Type the ordered vector size: ";
    cin >> size;

    cout << "Type the key(int) you want to find: ";
    cin >> key;
}

int main(){

    
    int key;
    int size;
    int result;
    vector<int> vector;

    menu(size, key);

    generateOrderedVector(vector, size);

    cout << endl << "Printing step by step.." << endl << endl;
    result = binarySearch(vector, 0, size, key, size/2);

    cout << "Found result: " << result << endl;
    

}