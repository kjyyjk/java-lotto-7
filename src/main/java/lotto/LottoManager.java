package lotto;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class LottoManager {
    private static final String INPUT_PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String LOTTO_PURCHASE_MESSAGE = "개를 구매했습니다.";
    private static final int LOTTO_PRICE = 1000;

    public void run() {
        int purchaseAmount = inputPurchaseAmount();
        List<Lotto> lottoes = purchaseLottoes(purchaseAmount);
        printPurchaseMessage(lottoes.size());
    }

    public int inputPurchaseAmount() {
        System.out.println(INPUT_PURCHASE_AMOUNT_MESSAGE);
        return Integer.parseInt(Console.readLine());
    }

    private List<Lotto> purchaseLottoes(final int purchaseAmount) {
        int totalLottoCount = purchaseAmount / LOTTO_PRICE;
        return LottoMachine.issueLottoes(totalLottoCount);
    }

    private static void printPurchaseMessage(final int purchasedLottoesCount) {
        System.out.println(purchasedLottoesCount + LOTTO_PURCHASE_MESSAGE);
    }
}
