/**
 * \brief Program to practice std::string use.
 * It simply convets two strings given on input into intgers
 * sum them, convets back into one string and then prints on output.
 * 
 * @author Joao Paulo Nunes
 * @date 2020/03/12
 */

#include <iostream>
#include <string>

using namespace std;

/** \brief Reads two strings from input and set their values. 
 * 
 * @param string
 * @param string
*/
void readStrings(string &s1, string &s2){

    cout << "Type the first string: ";
    cin >> s1;

    cout << "Type the second string: ";
    cin >> s2;

}

/** \brief Prints an string. 
 * 
 * @param string
*/
void printString(string &s1){
    
    cout << endl << "The result string is: " << s1 << endl;

}

/** \brief Convets an string into int.
 * the first decimal character are used as number to conversion
 * since it reachs an non-decimal character the rest of string is
 * ignored. 
 * 
 * @param string
 * @return int
 */
int stringToInt(string & s1){

    // If the string is ok to convert, already returns the int value
	try{

		int i = std::stoi(s1);
		return i;

    // Else it has any problem, prints error log and returns 0
	}catch (std::invalid_argument const &e){

		cout << endl << "Bad input: There's no number at begin of '" << s1 << "'" << endl;

	}catch (std::out_of_range const &e){

		cout << endl << "Integer overflow: The result number exceed int size on string '" << s1 << "'" << endl;

	}

	return 0;
}

/** \brief Converts an int into string.
 * There's no mistery, just an string compesed of decimal characters.
 * 
 * @param int
 * @return string 
 */
string intToString(int num){

    cout << endl << "Summing the two string numbers...";
    return to_string(num);

}

/** \brief Compare two given strings and return true if they're equal. 
 *
 * @param string
 * @param string
*/
void compareStrings(string &s1, string &s2){

    cout << endl << endl << "Comparing the two strings...";

    if(s1.compare(s2) == 0){

        cout << endl << "The string: '" << s1 << "' and '" << s2 << "'" << endl << "Are equals!" << endl;

    }else{

        cout << endl << "The string: '" << s1 << "' and '" << s2 << "'" << endl << "Are different!" << endl;

    }

}

/** \brief Concatenates two given strings and return the result string.
 * 
 * @param string;
 * @param string;
 * @return string
 */
string concatenate(string &s1, string &s2){

    cout << endl << "Concatenating..." << endl;
    return s1 + s2;

}

/** \brief Shows some string informations.
 * It basicaly show some given string's info to use some string type operations.
 * 
 * @param string
 */
void showStringDetails(string &s1){

    cout << endl << "Showing details of string: '" << s1 << "'" << endl << endl;

    cout << "The string size is " << s1.size() << endl;
    cout << "The string still can have " << s1.capacity()-s1.size() << " more characters" << endl;


}

int main(){

    string s1, s2, result;

    readStrings(s1, s2);

    int num1 = stringToInt(s1);
    int num2 = stringToInt(s2);

    result = intToString(num1 + num2);

    printString(result);

    compareStrings(s1, s2);

    result = concatenate(s1, s2);

    printString(result);

    showStringDetails(s1);

}