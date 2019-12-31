package network.platon.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes4;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.7.5.0.
 */
public class DecimalLiteralsChangeByte extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102d9806100206000396000f3fe608060405260043610610057576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806322e20d8f1461005c5780633db3fb0a146100e9578063c2b21da414610152575b600080fd5b34801561006857600080fd5b506100956004803603602081101561007f57600080fd5b81019080803590602001909291905050506101bb565b60405180827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b3480156100f557600080fd5b506100fe61024d565b60405180827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b34801561015e57600080fd5b5061016761027b565b60405180827bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b600080829050807c0100000000000000000000000000000000000000000000000000000000026000806101000a81548163ffffffff02191690837c0100000000000000000000000000000000000000000000000000000000900402179055506000809054906101000a90047c010000000000000000000000000000000000000000000000000000000002915050919050565b6000809054906101000a90047c01000000000000000000000000000000000000000000000000000000000281565b60008060009054906101000a90047c01000000000000000000000000000000000000000000000000000000000290509056fea165627a7a723058208c11e5fc2aafd7295d38a8dd5bdece8ad0fed73b43e0c7a6790817bbcdee33950029";

    public static final String FUNC_TESTCHANGE = "testChange";

    public static final String FUNC_B4 = "b4";

    public static final String FUNC_GETB4 = "getB4";

    @Deprecated
    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected DecimalLiteralsChangeByte(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> testChange(BigInteger a) {
        final Function function = new Function(
                FUNC_TESTCHANGE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> b4() {
        final Function function = new Function(FUNC_B4, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getB4() {
        final Function function = new Function(FUNC_GETB4, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes4>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DecimalLiteralsChangeByte> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DecimalLiteralsChangeByte.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DecimalLiteralsChangeByte load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DecimalLiteralsChangeByte(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}