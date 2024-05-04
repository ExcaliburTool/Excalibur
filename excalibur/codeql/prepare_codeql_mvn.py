import os
import shutil

TestFiles = [f[:-4] for f in os.listdir('../benchmarks/codeql') if '-hints' not in f] + \
    ['ArgumentsMethod', 'ArraysToString', 'BigDecimalDoubleConstructorProcessor', 'BooleanExpression',
     'ArrayHashCodeAndToStringProcessor', 'CollectionEmptyCheck', 'ComparizonModifier', 'ConvertOverloadMethod',
     'CollectionsEmptyConstantsProcessor', 'CompareToReturnValueProcessor', 'AssignmentNull',
     'ConvertVariableAccessName', 'ConvertVariableName', 'DeadStoreProcessor', 'EmptyStringCheck', 'EqualsNotCheckingConversion', 'EqualsOnAtomicClassProcessor',
     'FieldModifier', 'LoopHeadElement', 'InnerClassStatic', 'IsJunit4TestAnnotation', 'IsNullCondition', 'MathOnFloatProcessor',
     'MissingOverride', 'ObjectsEqualsInvocationFilter', 'PrimitiveToString', 'PrimitiveTypeEqualsBinaryOperatorFilter',
     'ProtectedMemberInFinalType', 'RedundantFieldInitialization', 'ReturnModifier', 'SerialVersionUidProcessor',
     'MotivatingExample',
     'StaticAccessThroughInstance', 'StringBuilderDirectUse', 'SuperEqualsMethodInvocationFilter', 'TargetModifier',
     'ThreadLocalWithInitial', 'ToStringReturningNullProcessor', 'UtilityClassWithPublicConstructorProcessor', 'VariableModifier'] + \
    [f[:-4] for f in os.listdir('../benchmarks/sporq') if '-hints' not in f and '-desc' not in f]

SrcFolder = '../benchmarks/ForCodeQL/src/main/java'


def extract_code(file):
    buffer = ""
    state = "0"
    with open(file, 'r') as f:
        lines = f.readlines()
        for line in lines:
            if line.strip() == 'output':
                return buffer
            if state == 'input':
                buffer += line
            if line.strip() == 'input':
                state = 'input'
    return None


def process_package(dir):
    if not os.path.exists(dir):
        os.makedirs(dir)
    for f in os.listdir(dir):
        if f.endswith('.txt') and f[0].isupper() and f[:-4] in TestFiles:
            full_path = os.path.join(dir, f)
            code = extract_code(full_path)
            benchmark = f[:-4]
            with open(os.path.join(SrcFolder, benchmark + '.java'), 'w') as of:
                of.write(code)
                of.flush()


if __name__ == '__main__':
    # create folder if not exists
    if not os.path.exists(SrcFolder):
        os.makedirs(SrcFolder)

    # delete files and directories in the folder
    for f in os.listdir(SrcFolder):
        full_path = os.path.join(SrcFolder, f)
        if os.path.isfile(full_path):
            os.remove(full_path)
        elif os.path.isdir(full_path):
            shutil.rmtree(full_path)

    process_package('../benchmarks/github')
    process_package('../benchmarks/codeql')
    process_package('../benchmarks/sporq')
