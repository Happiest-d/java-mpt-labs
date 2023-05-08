package mypacage;

import mypacage.domain.IFigure;
import mypacage.domain.Square;
import mypacage.domain.Rectangle;
import mypacage.util.CsvReader;
import mypacage.util.SerializeUtils;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IFigure> figures = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                figures.add(new Square(line));
            } else {
                figures.add(new Rectangle(line));
            }
        }

        figures.forEach(System.out::println);

        SerializeUtils.serialize(figures, binFile);
        List<IFigure> newFigures = (List<IFigure>) SerializeUtils.deserialize(binFile);
        System.out.println("New figures:");
        newFigures.forEach(System.out::println);
    }
}
