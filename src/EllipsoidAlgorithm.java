import weka.classifiers.Logistic;
import weka.core.DenseInstance;
import weka.core.Instances;

public class LogisticRegressionExample {

    public static void main(String[] args) {

        // 假设有一个包含数据点的二维数组
        double[][] dataPoints = {
                {2.0, 3.0},
                {4.0, 5.0},
                {6.0, 7.0},
                {8.0, 9.0}
        };

        // 假设数据点的类别标签（0 或 1）
        int[] classLabels = {0, 1, 1, 0};

        // 创建数据集
        Instances dataSet = new Instances("MyData", new DenseInstance(2), dataPoints.length);

        // 设置特征名称
        dataSet.setClassIndex(dataSet.numAttributes() - 1);

        // 为每个数据点添加特征值和类别标签
        for (int i = 0; i < dataPoints.length; i++) {
            DenseInstance instance = new DenseInstance(2);
            instance.setValue(0, dataPoints[i][0]);
            instance.setValue(1, dataPoints[i][1]);
            dataSet.add(instance);
            dataSet.instance(i).setClassValue(classLabels[i]);
        }

        // 构建并训练逻辑回归模型
        Logistic logistic = new Logistic();
        logistic.buildClassifier(dataSet);

        // 新的数据点
        double[] newDataPoint = {10.0, 11.0};

        // 创建新的实例
        DenseInstance newInstance = new DenseInstance(2);
        newInstance.setValue(0, newDataPoint[0]);
        newInstance.setValue(1, newDataPoint[1]);

        // 使用模型进行预测
        int predictedClass = (int) logistic.classifyInstance(newInstance);

        // 输出预测的类别
        System.out.println("Predicted Class: " + predictedClass);
    }
}
