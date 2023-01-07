package az.company.task.EnumHomeWork;

import java.util.Scanner;

public class EnumConsole {
    public static void main(String[] args) {
        System.out.println("Neçenci ay: ");
        Integer orderOfMonth=new Scanner(System.in).nextInt();
        System.out.println("Hansı dil: ");
        String language =new Scanner(System.in).next().toUpperCase();

        MonthEnum array[] = MonthEnum.values();

        if (LanguageEnum.valueOf(language)==LanguageEnum.EN){
            System.out.println(MonthEnum.valueOf(array[orderOfMonth-1].toString()));
        }if (LanguageEnum.valueOf(language)==LanguageEnum.AZ){
            System.out.println(MonthEnum.valueOf(array[orderOfMonth-1].toString()).getNameInAz());
        }if (LanguageEnum.valueOf(language)==LanguageEnum.RU){
            System.out.println(MonthEnum.valueOf(array[orderOfMonth-1].toString()).getNameInRu());
        }if (LanguageEnum.valueOf(language)==LanguageEnum.TR){
            System.out.println(MonthEnum.valueOf(array[orderOfMonth-1].toString()).getNameInTr());
        }
    }
}
