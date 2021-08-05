<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class GetTablesResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'tables',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\Table',
                ),
        ),
    );

    /**
     * @var \metastore\Table[]
     */
    public $tables = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['tables'])) {
                $this->tables = $vals['tables'];
            }
        }
    }

    public function getName()
    {
        return 'GetTablesResult';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->tables = array();
                        $_size956 = 0;
                        $_etype959 = 0;
                        $xfer += $input->readListBegin($_etype959, $_size956);
                        for ($_i960 = 0; $_i960 < $_size956; ++$_i960) {
                            $elem961 = null;
                            $elem961 = new \metastore\Table();
                            $xfer += $elem961->read($input);
                            $this->tables []= $elem961;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('GetTablesResult');
        if ($this->tables !== null) {
            if (!is_array($this->tables)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('tables', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->tables));
            foreach ($this->tables as $iter962) {
                $xfer += $iter962->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
