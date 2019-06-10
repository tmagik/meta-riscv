require recipes-kernel/linux/linux-sifive-common.inc

LINUX_VERSION ?= "4.19.x"
KERNEL_VERSION_SANITY_SKIP="1"

BRANCH = "riscv-linux-4.19"
SRCREV = "${AUTOREV}"

# qemu uses in-tree defconfig
# freedom-u540 uses out-of-tree defconfig
SRC_URI_append_freedom-u540 = " file://defconfig"

KBUILD_DEFCONFIG_qemuriscv32 = "rv32_defconfig"
KBUILD_DEFCONFIG_qemuriscv64 = "defconfig"
