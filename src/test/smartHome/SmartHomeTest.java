package smartHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeTest {

    // 関数を呼ぶことを確認するのか、実行結果を確認しているのか
    // 日本語・英語はどちらでもいい
    // 使うTest Doublesは spy, mock, dummy, stub, fake のどれか?
    // spy: 関数が呼ばれたことをテストする（どういう引数で呼ばれた、何回呼ばれた）
    // mock: オブジェクト内に状態を持つことが出来る
    // dummy: テストに影響を与えないデータを返す
    // stub: テストコード上で事前設定してからテストを実行する。そのように望ましいように間接入力を操作できるオブジェクトが、Test Stub
    // fake: 本物と同じように動けるTest Double
    @Test
    void turnBulbOn_whenSwitchIsOn() {
        SmartHome smartHome = new SmartHome();
        BulbSpy bulbSpy = new BulbSpy();
        SwitchOnStub aSwitch = new SwitchOnStub();
        smartHome.run(bulbSpy, aSwitch);

        assertTrue(bulbSpy.turnOn_wasCalled());
    }

    @Test
    void turnBulbOff_whenSwitchIsOff() {
        SmartHome smartHome = new SmartHome();
        BulbSpy bulbSpy = new BulbSpy();
        SwitchOffStub aSwitch = new SwitchOffStub();
        smartHome.run(bulbSpy, aSwitch);

        assertTrue(bulbSpy.turnOff_wasCalled());
        assertFalse(bulbSpy.turnOn_wasCalled());
    }
}