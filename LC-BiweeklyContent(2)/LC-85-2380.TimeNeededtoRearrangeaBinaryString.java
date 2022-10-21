package LC-BiweeklyContent(2);

public class LC-85-2380. TimeNeededtoRearrangeaBinaryString
{

int change(char * s){
    int f=0,i=0;
    while(s[i]!='\0'){
        if(s[i]-'0'==0 && s[i+1]-'0'==1){
            s[i]='1';
            s[i+1]='0';
            i=i+2;
            f=1;
        }
        else{
            i++;
        }
    }
    return f;
}

int secondsToRemoveOccurrences(char * s){
    int count=0;
    while(change(s)==1){
        count=count+1;
    }
    return count;
}
}
