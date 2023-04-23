import java.util.*;
class courseWorkObjectBase {
	
	static student [] studentDataArray = new student[0];
		
	static void bestInPRF(){
	L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Best In PRF")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			int count=0;
			for(int i=0;i<studentDataArray.length;i++){
				if(studentDataArray[i].mStatus == true){
					count++;
				}
			}
			if(count==0){
				System.out.print(String.format("%60s","No Data To Print\n\n"));
				while(true){
					System.out.print("Do You Want To Try Again[y/N] ? ");
					char ex = key.next().charAt(0);
					if(ex == 'Y' || ex == 'y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						return;
					}
				}
			}
			System.out.println("Numbers of Student : "+count);
			int[] sortPrfMarksArray = studentDataArray[0].sortPrfMarks();
			student[] sortStudentInPrf = new student[count];
			for(int i=0;i<count;) {
				if(studentDataArray[i].mStatus == true) {
					sortStudentInPrf[i] = studentDataArray[i];
					i++;
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			System.out.println(String.format("|%-7s|","ID")+String.format("%-25s|","Names")+String.format("%15s|","PRF Marks")+String.format("%15s|","DBMS Marks"));
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			for(int i=0;i<count;i++){
				for(int j=0;j<count;j++) {
					if(sortPrfMarksArray[i] == sortStudentInPrf[j].prfMark) {
						System.out.println(String.format("|%-7s|",sortStudentInPrf[j].studentId)+String.format("%-25s|",sortStudentInPrf[j].name)+String.format("%15d|",sortStudentInPrf[j].prfMark)+String.format("%15d|",sortStudentInPrf[j].dbmsMark));
					}
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			while(true){
				System.out.print("Do You Want To Try Again[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void bestInDBMS(){
	L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Best In DBMS")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			int count=0;
			System.out.print("+\n\n");
			for(int i=0;i<studentDataArray.length;i++){
				if(studentDataArray[i].mStatus == true){
					count++;
				}
			}
			if(count==0){
				System.out.println(String.format("%60s","No Data To Print\n\n\n"));
				while(true){
					System.out.print("Do You Want To Try Again[y/N] ? ");
					char ex = key.next().charAt(0);
					if(ex == 'Y' || ex == 'y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						return;
					}
				}
			}
			System.out.println("Numbers of Student : "+count);
			int[] sortDbmsMarksArray = studentDataArray[0].sortDbmsMarks();
			student[] sortStudentInDbms = new student[count];
			for(int i=0;i<count;) {
				if(studentDataArray[i].mStatus == true) {
					sortStudentInDbms[i] = studentDataArray[i];
					i++;
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			System.out.println(String.format("|%-7s|","ID")+String.format("%-25s|","Names")+String.format("%15s|","DBMS Marks")+String.format("%15s|","PRF Marks"));
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			for(int i=0;i<count;i++){
				for(int j=0;j<count;j++) {
					if(sortDbmsMarksArray[i] == sortStudentInDbms[j].dbmsMark) {
						System.out.println(String.format("|%-7s|",sortStudentInDbms[j].studentId)+String.format("%-25s|",sortStudentInDbms[j].name)+String.format("%15d|",sortStudentInDbms[j].dbmsMark)+String.format("%15d|",sortStudentInDbms[j].prfMark));
					}
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			while(true){
				System.out.print("Do You Want To Print Again[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
 	static void printRank(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Print Student Rank")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			int count=0;
			for(int i=0;i<studentDataArray.length;i++){
				if(studentDataArray[i].mStatus == true){
					count++;
				}
			}
			if(count==0){
				System.out.print(String.format("%60s","No Data To Print\n\n"));
				while(true){
					System.out.print("Do You Want To Try Again[y/N] ? ");
					char ex = key.next().charAt(0);
					if(ex == 'Y' || ex == 'y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						return;
					}
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<8;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<11;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.println("+");
			System.out.println(String.format("|%-7s|","Rank")+String.format("%-8s|","ID")+String.format("%-25s|","Name")+String.format("%-7s|","Total Marks")+String.format("%-7s|","Average"));
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<8;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<11;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.println("+");
			int[] rank = new int[count];
			for(int i=0;i<rank.length;i++) {
				rank[i]=(i+1);
			}
L2:		for(int i=0;i<studentDataArray.length;i++){
				for(int j=0;j<studentDataArray.length;j++) {
					if(rank[i] == studentDataArray[j].individualRank(studentDataArray[j].mAverage) ) {
						System.out.println(String.format("|%-7d|",studentDataArray[i].individualRank(studentDataArray[i].mAverage))+String.format("%-8s|",studentDataArray[i].studentId)+String.format("%-25s|",studentDataArray[i].name)+String.format("%11d|",studentDataArray[i].total)+String.format("%7s|",String.format("%.2f",studentDataArray[i].mAverage)));
					}
				}
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<8;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<25;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<11;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<7;i++){
				System.out.print("-");
			}
			System.out.println("+");
			while(true){
				System.out.print("Do You Want To Print Again[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void printStudentDetails(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Print Student Details")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
			int index=0;
L2:	while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count=0;
				for(int i=0;i<studentDataArray.length;i++) {
					if(studentDataArray[i].equals(new student(stn,null))) {
						count++;
						index=i;
						break;
					}
				}
				if(count == 1){
					if(studentDataArray[index].mStatus == true){
						break L2;
					}else if(studentDataArray[index].mStatus == false){
						System.out.print("Marks  Aren't  Added !.Use [3]  Add  Marks!.");
L3:					while(true) {
							System.out.print("Do You Want To Go To Main Menu ?[y/N] ");
							char choice = key.next().charAt(0);
							if(choice == 'y' || choice == 'Y' ) {
								clearConsole();
								return;
							} else if(choice == 'N' || choice == 'n') {
								clearConsole();
								continue L1;
							}else {
								continue L3;
							}
						}
					}
				}else if(count == 0){
					System.out.print("Student ID Not Found !.");
L4:				while(true) {
						System.out.print("Do You Want Search Again ?[y/N] ");
						char choice = key.next().charAt(0);
						if(choice == 'n' || choice == 'N' ) {
							clearConsole();
							return;
						} else if(choice == 'y' || choice == 'Y') {
								clearConsole();
							continue L1;
						}else {
							continue L4;
						}
					}
				}
			}
			System.out.println("Student Name Is : "+studentDataArray[index].name);
			System.out.print("+");
			for(int i=0;i<30;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			String[] rankWord = {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth"};
			System.out.print("+\n");
			String wordR="";
			System.out.println(String.format("|%-30s|","Programming Fundamental")+String.format("%15d|",studentDataArray[index].prfMark));
			System.out.println(String.format("|%-30s|","Database Management System")+String.format("%15d|",studentDataArray[index].dbmsMark));
			System.out.println(String.format("|%-30s|","Total Marks")+String.format("%15d|",studentDataArray[index].total));
			System.out.println(String.format("|%-30s|","Avg. Marks")+String.format("%16s",(String.format("%.2f|",studentDataArray[index].mAverage))));
			System.out.println(String.format("|%-30s|","Rank")+String.format("%15d|",studentDataArray[index].individualRank(studentDataArray[index].mAverage)));
			System.out.print("+");
			for(int i=0;i<30;i++){
				System.out.print("-");
			}
			System.out.print("+");
			for(int i=0;i<15;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			while(true){
				System.out.print("Do You Want To Print Another Student's Detail[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void deleteStudent(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Delete Student")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
			int index=0;
	L2:	while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count=0;
				for(int i=0;i<studentDataArray.length;i++) {
					if(studentDataArray[i].equals(new student(stn,null))) {
						count++;
						index=i;
						break;
					}
				}
				if(count == 1){
					break;
				}else if(count == 0){
					System.out.print("Student ID Not Found !.");
L4:			while(true) {
							System.out.print("Do You Want Search Again ?[y/N] ");
							char choice = key.next().charAt(0);
							if(choice == 'n' || choice == 'N' ) {
								clearConsole();
								return;
							} else if(choice == 'y' || choice == 'Y') {
								clearConsole();
								continue L1;
							}else {
								continue L4;
							}
					}
				}
			}
			System.out.println("Student Name : "+studentDataArray[index].name);
			int newLength = studentDataArray.length-1;
			int oldLength = studentDataArray.length;
L5:		while(true){
				System.out.print("Are You Sure, You Want To Delete[y/N] ? ");
				char e = key.next().charAt(0);
				if(e == 'y' || e == 'Y'){
					for(int i=index;i<studentDataArray.length-1;i++) {
						studentDataArray[i] = studentDataArray[i+1];
					}
					if(newLength == (oldLength-1)){
						for(student object : studentDataArray) {
							System.out.print(object.toString());
						}
						System.out.print("Student Deleted Successfull !.");
						break L5;
					}else {
						System.out.print("Student Delete Failed !.");
						break L5;
					}
				}else if(e == 'n' || e == 'N'){
					clearConsole();
					return;
				}else{
					continue L5;
				}
			}
L6:		while(true){
				System.out.print("Do You Want To Delete Another Student's Marks[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void updateMarks(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Update Marks")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
			int index=0;
L2:		while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count=0;
				for(int i=0;i<studentDataArray.length;i++) {
					if(studentDataArray[i].equals(new student(stn,null))) {
						count++;
						index=i;
						break;
					}
				}
				if(count == 1){
					if(studentDataArray[index].mStatus == true) {
						break;
					}else if(studentDataArray[index].mStatus == false) {
						System.out.println("Marks Not Added Use [3] To Add Marks !");
L3:					while(true) {
							System.out.print("Do You Want Search Again ?[y/N] ");
							char choice = key.next().charAt(0);
							if(choice == 'n' || choice == 'N' ) {
								clearConsole();
								return;
							} else if(choice == 'y' || choice == 'Y') {
								clearConsole();
								continue L1;
							}else {
							continue L3;
							}
						}
					}
				}else if(count == 0){
					System.out.println("Student ID Not Found !");
L4:			while(true) {
						System.out.print("Do You Want Search Again ?[y/N] ");
						char choice = key.next().charAt(0);
						if(choice == 'n' || choice == 'N' ) {
							clearConsole();
								return;
						} else if(choice == 'y' || choice == 'Y') {
							clearConsole();
							continue L1;
						}else {
							continue L4;
						}
					}
				}
			}
			System.out.println("Student Name : "+studentDataArray[index].name+"\n");
			int newPrfMark;
			while(true){
				System.out.print("Enter the New PRF Marks : ");
				newPrfMark = key.nextInt();
				if(newPrfMark<0 || newPrfMark>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			int newDbmsMark;
			while(true){
				System.out.print("Enter the New DBMS Marks : ");
				newDbmsMark = key.nextInt();
				if(newDbmsMark<0 || newDbmsMark>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			int oldPrfMark = studentDataArray[index].prfMark;
			int oldDbmsMark = studentDataArray[index].dbmsMark;
			studentDataArray[index].updateNewMarks(newPrfMark,newDbmsMark);
			
			if(oldPrfMark != newPrfMark || oldDbmsMark != newDbmsMark) {
				System.out.print("Marks Updated Successfull. ");
			}else if(oldPrfMark == newPrfMark && oldDbmsMark == newDbmsMark) {
				System.out.print("Marks Updated With Old Marks !.");
			} else {
				System.out.print("Marks Update Failed !.");
			}
			while(true){
				System.out.print("Do You Want To Update Another Student's Marks [y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void updateStudentDetails(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Update Student Details")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
			int index=0;
L2:			while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count=0;
				for(int i=0;i<studentDataArray.length;i++) {
					if(studentDataArray[i].equals(new student(stn,null))) {
						count++;
						index=i;
						break;
					}
				}
				if(count == 1){
					break;
				}else if(count == 0){
					System.out.println("Student ID Not Found !");
		L4:		while(true) {
						System.out.print("Do You Want Search Again ?[y/N] ");
						char choice = key.next().charAt(0);
						if(choice == 'n' || choice == 'N' ) {
							clearConsole();
								return;
						} else if(choice == 'y' || choice == 'Y') {
							clearConsole();
							continue L1;
						}else {
							continue L4;
						}
					}
				}
			}
			System.out.println("Student Name : "+studentDataArray[index].name+"\n");
			System.out.print("Enter The New Name To Update : ");
			String newName = key.nextLine();
			String oldName = studentDataArray[index].name;
			studentDataArray[index].updateName(newName);
			if(oldName != newName) {
				System.out.println("New Name Updated Successfull");
			}else {
				System.out.println("New Name Update Failed !");
			}
			while(true){
				System.out.print("Do You Want Update Another Student's Details[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void addMarks(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%45s"," ")+String.format("%-50s","Add Marks")+String.format("%5s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
			int index=0;
	L2:	while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count=0;
				for(int i=0;i<studentDataArray.length;i++) {
					if(studentDataArray[i].equals(new student(stn,null))) {
						count++;
						index=i;
						break;
					}
				}
				if(count == 1){
					if(studentDataArray[index].mStatus == true){
						System.out.println("Marks Alredy Added !\n");
	L3:				while(true) {
							System.out.print("Do You Want Search Again ?[y/N]");
							char choice = key.next().charAt(0);
							if(choice == 'n' || choice == 'N' ) {
								clearConsole();
								return;
							} else if(choice == 'y' || choice == 'Y') {
								clearConsole();
								continue L1;
							}else {
								continue L3;
							}
						}
					}else if(studentDataArray[index].mStatus == false){
						break;
					}
				}else if(count == 0){
					System.out.println("Student ID Not Found !");
		L4:		while(true) {
							System.out.print("Do You Want Search Again ?[y/N]");
							char choice = key.next().charAt(0);
							if(choice == 'n' || choice == 'N' ) {
								clearConsole();
								return;
							} else if(choice == 'y' || choice == 'Y') {
								clearConsole();
								continue L1;
							}else {
								continue L4;
							}
					}
				}
			}
			System.out.println("Student Name : "+studentDataArray[index].name+"\n");
			int prf;
			while(true){
				System.out.print("Enter the PRF Marks : ");
				prf = key.nextInt();
				if(prf<0 || prf>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			int dbms;
			while(true){
				System.out.print("Enter the DBMS Marks : ");
				dbms = key.nextInt();
				if(prf<0 || prf>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			studentDataArray[index].addMarkToObjectArray(prf,dbms);
			if(studentDataArray[index].mStatus == true) {
				System.out.print("Marks Added Successfull !.");
			}else {
				System.out.print("Marks Update Failed !");
			}
			while(true){
				System.out.print("Do You Want Add Another Student's Marks[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void addNewStudentWithMarks(){
L1:	while(true){
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%35s"," ")+String.format("%-50s","Add New Student With Marks")+String.format("%15s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
L2:		while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count = 0;
				for(student object : studentDataArray) {
					if(object.equals(new student(stn,null))) {
						count++;
						break;
					}
				}
				if(count == 1) {
					System.out.println("Student ID Already Exists !. Use [3] To Add Marks !");
L3:				while(true) {
						System.out.print("Do You Want Search Again ? [y/N] ");
						char choice = key.next().charAt(0);
						if(choice == 'n' || choice == 'N' ) {
							clearConsole();
							return;
						} else if(choice == 'y' || choice == 'Y') {
							clearConsole();
							continue L1;
						}else {
							continue L3;
						}
					}
				}else if(count == 0) {
					break;
				}
			}
			
			student[] tempStudent = new student[studentDataArray.length+1];
			for(int i=0;i<studentDataArray.length;i++){
				tempStudent[i]=studentDataArray[i];
			}
			studentDataArray=tempStudent;
			for(int i=0;i<studentDataArray.length;i++){
				studentDataArray[i]=tempStudent[i];
			}
			System.out.print("Enter The Name : ");
			String name = key.nextLine();
			System.out.println();
			int prf;
			while(true){
				System.out.print("Enter the PRF Marks : ");
				prf = key.nextInt();
				if(prf<0 || prf>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			int dbms;
			while(true){
				System.out.print("Enter the DBMS Marks : ");
				dbms = key.nextInt();
				if(dbms<0 || dbms>100){
					System.out.println("Invalid Marks !");
					continue;
				}else{
					break;
				}
			}
			student addStudentNameAndId = new student(stn,name,prf,dbms);
			studentDataArray[studentDataArray.length-1] = addStudentNameAndId; 
			if(addStudentNameAndId.studentId != "Not _Set"){
				System.out.print("New Student Added Successfull.");
			}else {
				System.out.print("New Student Add Failed !");
			}
			
			while(true){
				System.out.print("Do You Want Add Another Student[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static void addNewStudent(){
L1:	while(true) {
			Scanner key = new Scanner(System.in);
			System.out.print("+");
			for(int i=0;i<100;i++){
			System.out.print("-");
			}
			System.out.print("+\n");
			System.out.print(String.format("|%s",(String.format("%40s"," ")+String.format("%-50s","Add New Student")+String.format("%10s|"," "))));
			System.out.print("\n+");
			for(int i=0;i<100;i++){
				System.out.print("-");
			}
			System.out.print("+\n\n");
			String stn;
L2:		while(true){
				System.out.print("Enter the Student ID : ");
				stn = key.nextLine();
				int count = 0;
				for(student object : studentDataArray) {
					if(object.equals(new student(stn,null))) {
						count++;
						break;
					}
				}
				if(count == 1) {
					System.out.print("Student ID Already Exists !.");
L3:				while(true) {
						System.out.print("Do You Want Search Again ? [y/N] ");
						char choice = key.next().charAt(0);
						if(choice == 'n' || choice == 'N' ) {
							clearConsole();
							return;
						} else if(choice == 'y' || choice == 'Y') {
							clearConsole();
							continue L1;
						}else {
							continue L3;
						}
					}
				}else if(count == 0) {
					break;
				}
			}
			
			student[] tempStudent = new student[studentDataArray.length+1];
			for(int i=0;i<studentDataArray.length;i++){
				tempStudent[i]=studentDataArray[i];
			}
			studentDataArray=tempStudent;
			for(int i=0;i<studentDataArray.length;i++){
				studentDataArray[i]=tempStudent[i];
			}
			System.out.print("Enter The Name : ");
			String name = key.nextLine();
			student addStudentNameAndId = new student(stn,name);
			studentDataArray[studentDataArray.length-1] = addStudentNameAndId; 
			if(addStudentNameAndId.studentId != "Not_Set") {
				System.out.println("New Student Added Successfull\n");
			}else {
				System.out.println("New Student Add Failed !");
			}
			while(true){
				System.out.print("Do You Want Add Another Student[y/N] ? ");
				char ex = key.next().charAt(0);
				if(ex == 'Y' || ex == 'y'){
					clearConsole();
					continue L1;
				}else if(ex == 'n' || ex == 'N' ){
					clearConsole();
					return;
				}else{
					clearConsole();
					return;
				}
			}
		}
	}
	static int startMenu(){
		Scanner key = new Scanner(System.in);
		System.out.print("+");
		for(int i=0;i<100;i++){
			System.out.print("-");
		}
		System.out.print("+\n");
		System.out.print(String.format("|%s",(String.format("%30s"," ")+String.format("%-60s","Welcome To Student Marks Management System")+String.format("%10s|"," "))));
		System.out.print("\n+");
		for(int i=0;i<100;i++){
			System.out.print("-");
		}
		System.out.print("+");
		System.out.print("\n");
		System.out.println("DEVELOP BY >>HNK<<\nBATCH 63 GDSE");
		System.out.print("\n");
		System.out.print(String.format("%-40s","[1] Add New Student")+String.format("%-10s","[2] Add New Student With Marks")+"\n"+String.format("%-40s","[3] Add Marks")+String.format("%-10s","[4] Update Student Details")+"\n"+String.format("%-40s","[5] Update Marks")+String.format("%-10s","[6] Delete Student")+"\n"+String.format("%-40s","[7] Print Student Details")+String.format("%-10s","[8] Print Student Rank")+"\n"+String.format("%-40s","[9] Best In Programming Fundamentals")+String.format("%-10s","[10] Best In Database Management System"));
		
		int option;
		while(true){
			System.out.print("\n\n\n");
			System.out.print("Enter Your Option To Proceed->>> ");
			option = key.nextInt();
			if(option <= 0 || option > 10){
				clearConsole();
				continue;
			}else{
				break;
			}
		}
		return option;
	}
	public static void main(String args[]){
		while(true){
			int option=startMenu();
			clearConsole();
			switch(option){
				case 1 : addNewStudent();
				break;
				case 2 : addNewStudentWithMarks();
				break;
				case 3 : addMarks();
				break;
				case 4 : updateStudentDetails();
				break;
				case 5 : updateMarks();
				break;
				case 6 : deleteStudent();
				break;
				case 7 : printStudentDetails();
				break;
				case 8 : printRank();
				break;
				case 9 : bestInPRF();
				break;
				case 10 : bestInDBMS();
				break;
				default : System.out.println("Still Under Development");
			}
		}
	}
	public final static void clearConsole() { 
		try {
			final String os = System.getProperty("os.name"); 
				if (os.contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
					System.out.print("\033[H\033[2J"); 
					System.out.flush();
				}
			} catch (final Exception e) {
					e.printStackTrace();
					// Handle any exceptions.
			}
	}
}
