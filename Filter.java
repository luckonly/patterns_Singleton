package patterns_Singlton;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    int filter;

    public Filter(int filter) {
        this.filter = filter;
    }

    public List<Integer> filterOut(List<Integer> list) {

        Logger logger = Logger.getInstance();
        List<Integer> filteredList = new ArrayList<>();
        logger.log(logger.currentDate() + "Начинаем фильтровать список:");

        for (int value : list) {

            if (value > filter) {
                logger.log(logger.currentDate() + "Значение " + value + " попало по условию");
                filteredList.add(value);
            } else {
                logger.log(logger.currentDate() + "Значение " + value + " НЕ попало по условию");
            }
        }
        logger.log(logger.currentDate() + "Закончили фильтровать список");
        return filteredList;

    }


}
