package dev.deepdaddyttv.deepnullreforged.inventory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeepNullGhostSlotFilterTest {
    @Test
    void whitelist_requires_a_match() {
        assertFalse(DeepNullInventory.resolvesGhostSlotFilter(DeepNullFilterMode.WHITELIST, false));
        assertTrue(DeepNullInventory.resolvesGhostSlotFilter(DeepNullFilterMode.WHITELIST, true));
    }

    @Test
    void blacklist_requires_no_match() {
        assertTrue(DeepNullInventory.resolvesGhostSlotFilter(DeepNullFilterMode.BLACKLIST, false));
        assertFalse(DeepNullInventory.resolvesGhostSlotFilter(DeepNullFilterMode.BLACKLIST, true));
    }
}
