package utilities;

import testCases.SupportingDocs;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ExtractSpecificColumn {

    public List<String> ExtractColumn(String methodName, int columnIndex) throws NoSuchMethodException, IOException {
        ReadXlSData rd = new ReadXlSData();
        int columnToExtract = columnIndex; // 0-based index
        List<String> extractedColumn = new ArrayList<>();
        Method method = SupportingDocs.class.getMethod(methodName);
        String[][] data = rd.getData(method);
        for (String[] row : data) {
            if (columnToExtract < row.length) {
                extractedColumn.add(row[columnToExtract]);
            }
        }
        return extractedColumn;
    }
}
