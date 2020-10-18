package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0),
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("+5 Dexterity Vest", -10, 20),
                new Item("+5 Dexterity Vest", -10, -20),
                new Item("+5 Dexterity Vest", -10, 60),
                new Item("Aged Brie", 2, 0), //
                new Item("Aged Brie", -2, 48),
                new Item("Aged Brie", 5,-5),
                new Item("Aged Brie", 5,51),
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Sulfuras, Hand of Ragnaros", 1, 80),
                new Item("Sulfuras, Hand of Ragnaros", 1, 70),
                new Item("Sulfuras, Hand of Ragnaros", -1, -80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", -5,0),
                new Item("Backstage passes to a TAFKAL80ETC concert",10,3),
                new Item("Backstage passes to a TAFKAL80ETC concert",11,3),
                new Item("Backstage passes to a TAFKAL80ETC concert",5,3),
                new Item("Backstage passes to a TAFKAL80ETC concert",5,48),
                new Item("Backstage passes to a TAFKAL80ETC concert",-1,3),
                new Item("Backstage passes to a TAFKAL80ETC concert",10,-3),
                new Item("Backstage passes to a TAFKAL80ETC concert",10,51),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6),
                new Item("Conjured Mana Cake", -3, 20),
                new Item("Conjured Mana Cake", 3, -6),
                new Item("Conjured Mana Cake", 3, 51)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        System.out.println("name, sellIn, quality");
        for (Item item : items) {
            System.out.println(item);
        }
        app.items[0].toString();
        assertThat(app.items[0].name, is("foo"));





    }

}
