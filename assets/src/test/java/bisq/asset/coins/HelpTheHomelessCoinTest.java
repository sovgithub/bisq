/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class HelpTheHomelessCoinTest extends AbstractAssetTest {

    public HelpTheHomelessCoinTest() {
        super(new HelpTheHomelessCoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("HN83aKuX7KfqJintLk4QYLYKMn2jiiABhZ");
        assertValidAddress("HPBaLqW2sgWQWr3zufNMcByueh14649Be9");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("HX83aKuN7KfqJintZk4qYLYKMn2JiiABhL");
        assertInvalidAddress("HX87aKuN3KfqJintLk4qKLYYZn2JiiABhM");
        assertInvalidAddress("XH83aKuN7KfqJintLk4qYLYKMn2JiiAZhB#");
        assertInvalidAddress("HX83aKqN7KfqJintLk4uYLYKMn2JihABiZ");
        assertInvalidAddress("HX83aKuN7KfqJintLk4qYLYKMn2JiiZBhA");
    }
}
