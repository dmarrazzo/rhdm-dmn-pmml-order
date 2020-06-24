RHDM DMN PMML ORDER
=======================

Example of PMML execution via DMN.

Highlights
-----------------------

- Model generated by [SkLearn2PMML](https://github.com/jpmml/sklearn2pmml)

- PMML supported version is 4.3:

  ```xml
  <PMML version="4.3" xmlns="http://www.dmg.org/PMML-4_3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  ```

- In order to have a nice label for the model selection in the DMN file add the optional `modelName` attribute:

  ```xml
  <RegressionModel modelName="approvalRegression" functionName="classification" normalizationMethod="logit">
  ```